<template>
  <scroll-view scroll-x class="site-cate">
    <div class="site-cate">
        <div class="cate" @click="clickItem(item)" v-bind:class="{active:index == 0}" v-for="(item,index) in cates" v-bind:key="index"><div>{{item.title}}</div></div>
    </div>
  </scroll-view>
</template>

<script>
export default {
  data() {
    return {
      cates: []
    };
  },
  methods: {
    clickItem(item) {
      if(item.categoryId == 0){
        getCurrentPages()[getCurrentPages().length - 1].onLoad();
        return false;
      }
      let url = "../category/main?categoryId=" + item.categoryId + "&title=" + item.title;
      wx.navigateTo({ url });
    }
  },
  created() {
    this.$http.get("/category/all").then(response => {
      this.cates = response.result;
    });
  }
};
</script>

<style>
.site-cate {
  display: flex;
  flex-direction: row;
  width: 750rpx;
  background-color: #fb655e;
  z-index: -1;
  height: 80rpx;
  line-height: 80rpx;
  position: fixed;
  left: 0;
  right: 0;
  z-index: 2;
  overflow: scroll
}

.site-cate .cate {
  white-space: nowrap;
  color: #ffffff;
  font-size: 30rpx;
  padding: 0 20rpx;
  position: relative;
}

.site-cate .cate.active:after {
  content: " ";
  display: block;
  position: absolute;
  bottom: 0rpx;
  left: 10rpx;
  right: 10rpx;
  height: 5rpx;
  background-color: #ffffff;
  z-index: 999;
}
</style>
