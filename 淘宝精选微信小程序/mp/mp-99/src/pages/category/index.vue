<template>
  <div class="page">
    <goodsList :products="products"></goodsList>
  </div>
</template>

<script>
import goodsList from "@/components/goodsList";

export default {
  components: {
    goodsList
  },

  data() {
    return {
      products: [],
      pager: {
        pageIndex: 1,
        pageSize: 20,
        orderBy: "createTime",
        sort: "desc",
        totalPage: 10,
        categoryId: 0
      }
    };
  },

  methods: {
    //下拉刷新
    async refresh() {
      this.pager.pageIndex = 1;
      this.$http.get("/product", this.pager).then(response => {
        this.products = response.results;
        wx.stopPullDownRefresh();
      });
    },
    //加载更多
    async loadMore() {
      //防止超页码获取
      if (this.pager.pageIndex == this.pager.totalPage) {
        return false;
      }
      this.pager.pageIndex++;
      this.$http.get("/product", this.pager).then(response => {
        //追加数据
        this.products = this.products.concat(response.results);
        this.pager.totalPage = response.totalPage;
        wx.stopPullDownRefresh();
      });
    }
  },
  onLoad() {
    let params = this.$root.$mp.query;
    this.pager.categoryId = params.categoryId;
    wx.setNavigationBarTitle({
      title: params.title
    });
    this.refresh();
  },

  created() {

  },
  // 下拉刷新
  async onPullDownRefresh() {
    this.refresh();
  },
  async onReachBottom() {
    this.loadMore();
  }
};
</script>

<style>
</style>
