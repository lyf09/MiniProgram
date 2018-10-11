<template>
  <div class="block-title-wrapper">
   <div class="block-title"><p class="small-title">{{text}}</p></div>
  </div>
</template>

<script>
export default {
  props: ['text']
}
</script>

<style>
.block-title-wrapper{
  text-align: center
}
.block-title .small-title {
  padding: 30rpx;
  text-align: center;
  position: relative;
  color: #636363;
  font-size: 30rpx;
  display: inline-block;
  margin: 0 auto;
}
.block-title .small-title::before,
.block-title .small-title::after {
  content: " ";
  position: absolute;
  left: -80rpx;
  height: 3rpx;
  width: 100rpx;
  display: block;
  background-color: #8e8e8e;
  top: 50rpx;
}
.block-title .small-title::after {
  height: 3rpx;
  left: auto;
  right: -80rpx;
}
</style>
