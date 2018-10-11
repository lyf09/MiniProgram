<template>
  <div class="site-nav">
    <div class="nav-item" v-for="(item, index) in nav" v-bind:key="index"><img v-bind:src="item.pic" class="nav-pic"><span class="title">{{item.title}}</span></div>
  </div>
</template>

<script>
export default {
  props: ["nav"],
  methods: {
    clickItem(item){
      console.log(item);
    }
  }
};
</script>

<style>
.site-nav {
  margin: 0 15rpx;
  -webkit-box-shadow: #BDBDBD 0px 0px 5rpx;
  -moz-box-shadow: #BDBDBD 0px 0px 5rpx;
  box-shadow: #BDBDBD 0px 0px 5rpx;
  border-radius: 10rpx;
  box-sizing: border-box;
  overflow: hidden;
  padding: 30rpx 25rpx;
  position: relative;
  background-color: #ffffff;
  display: flex;
  flex-flow: row wrap;
  align-content: flex-start;
  margin-top: 20rpx;
}

.site-nav .nav-item {
  -webkit-flex: 0 0 100rpx;
  flex: 0 0 100rpx;
  text-align: center;
  margin-right: 43rpx;
  box-sizing: border-box
}
.site-nav .nav-item:last-child{
  margin-right: 0;
}

.site-nav .nav-item .title{
  font-size: 22rpx;
  display: block;
}
.site-nav .nav-item .nav-pic{
  width: 80rpx;
  height: 80rpx;
  margin-bottom: 10rpx;
}
</style>
