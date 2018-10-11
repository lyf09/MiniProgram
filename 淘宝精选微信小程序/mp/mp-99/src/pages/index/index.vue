<template>
  <div class="home-page">
   <category></category>
    <div class="site-banner">
      <swiper class="swiper" autoplay="true" interval="3000" duration="500" circular="true">
        <block v-for="(item, index) in swiper" :index="index" :key="index">
          <swiper-item @click="redirectPage('../logs/main', $e)">
              <image :src="item.url" class="slide-image" mode="aspectFill"/>
          </swiper-item>
        </block>
      </swiper>
      <div class="site-search-bar" @click="redirectPage('../logs/main', $e)">
        <i class="iconfont icon-search"></i> <span class="keywords">搜索</span>
      </div>
    </div>
    <navigation :nav="nav"></navigation>
    <title :text="'精选商品(下次更新时间14:00)'"></title>
    <goodsList :products="products"></goodsList>
  </div>


<!--   <div class="container" @click="clickHandle('test click', $event)">

    <div class="userinfo" @click="bindViewTap">
      <img class="userinfo-avatar" v-if="userInfo.avatarUrl" :src="userInfo.avatarUrl" background-size="cover" />
      <div class="userinfo-nickname">
        <card :text="userInfo.nickName"></card>
      </div>
    </div>

    <div class="usermotto">
      <div class="user-motto">
        <card :text="motto"></card>
      </div>
    </div>

    <form class="form-container">
      <input type="text" class="form-control" v-model="motto" placeholder="v-model" />
      <input type="text" class="form-control" v-model.lazy="motto" placeholder="v-model.lazy" />
    </form>
    <a href="/pages/counter/main" class="counter">去往Vuex示例页面</a>
  </div> -->
</template>

<script>
import goodsList from "@/components/goodsList";
import navigation from "@/components/navigation";
import category from "@/components/category";
import title from "@/components/title";

export default {
  components: {
    category,
    goodsList,
    navigation,
    title
  },

  data() {
    return {
      motto: "Hello World",
      userInfo: {},
      nav: [
        {
          pic: "http://test.zijian6.cn/static/icon/pick.png",
          title: "今日精选"
        },
        {
          pic: "http://test.zijian6.cn/static/icon/packages.png",
          title: "9.9包邮"
        },
        {
          pic: "http://test.zijian6.cn/static/icon/qg.png",
          title: "淘抢购"
        },
        {
          pic: "http://test.zijian6.cn/static/icon/invite.png",
          title: "邀请赚钱"
        },
        {
          pic: "http://test.zijian6.cn/static/icon/kefu.png",
          title: "客服"
        }
      ],
      swiper: [
        {
          url:
            "//img.alicdn.com/bao/uploaded/i1/122689695/TB1H40WuVooBKNjSZPhXXc2CXXa_!!0-item_pic.jpg"
        },
        {
          url:
            "//img.alicdn.com/bao/uploaded/i4/184405472/TB1QhVsgY_I8KJjy1XaXXbsxpXa_!!0-item_pic.jpg"
        },
        {
          url:
            "//img.alicdn.com/bao/uploaded/i2/248358071/TB26PaBgNTI8KJjSspiXXbM4FXa_!!248358071.jpg"
        },
        {
          url:
            "//img.alicdn.com/bao/uploaded/i2/23503869/TB21OVLlNPI8KJjSspfXXcCFXXa_!!23503869.jpg"
        }
      ],
      products: [],
      pager: {
        pageIndex: 1,
        pageSize: 20,
        orderBy: "rand()",
        sort: "desc",
        totalPage: 10,
      }
    };
  },

  methods: {
    redirectPage(url, e) {
      //跳转页面
      console.log(url);
      wx.navigateTo({ url });
    },
    clickItem(item) {
      console.log(item);
    },
    bindViewTap() {
      const url = "../logs/main";
      wx.navigateTo({ url });
    },
    getUserInfo() {
      // 调用登录接口
      // wx.login({
      //   success: () => {
      //     wx.getUserInfo({
      //       success: res => {
      //         this.userInfo = res.userInfo;
      //       }
      //     });
      //   }
      // });
    },
    clickHandle(msg, ev) {
      console.log("clickHandle:", msg, ev);
    },
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

  created() {
    // 调用应用实例的方法获取全局数据
    this.getUserInfo();
  },
  onLoad() {
    this.refresh();
  },
  // 下拉刷新
  async onPullDownRefresh() {
    this.refresh();
  },
  async onReachBottom() {
    // 上拉加载
    this.loadMore();
  }
};
</script>

<style>
.home-page .goods-list {
  padding-top: 0;
}
/*
.home-page .block-title .small-title {
  padding-top: 0;
  padding-bottom: 15rpx;
} */
.site-banner {
  height: 435rpx;
  background-color: #cccccc;
  position: relative;
  top: 80rpx;
}

.site-banner .swiper {
  height: 435rpx;
  overflow: hidden;
}

.site-banner .slide-image {
  width: 100%;
  height: 100%;
}

.site-search-bar {
  position: absolute;
  left: 30rpx;
  right: 30rpx;
  top: 35rpx;
  height: 60rpx;
  background-color: rgba(255, 255, 255, 0.9);
  border-radius: 40rpx;
  line-height: 60rpx;
  z-index: 1;
}

.site-search-bar .keywords {
  font-size: 24rpx;
  color: #979797;
  padding-left: 20rpx;
  padding-top: 10rpx;
}
</style>
