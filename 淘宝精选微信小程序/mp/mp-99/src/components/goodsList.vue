<template>
  <div class="goods-list">
    <div class="goods-item" v-for="(item, index) in products" v-bind:key="index" @click="clickItem(item)">
      <img v-bind:src="item.coverPic" class="item-pic">
      <div class="item-bottom">
        <p class="item-title"><i class=""></i>{{item.productTitle}}</p>
        <p class="market-price">&yen;{{item.marketPrice}}</p>
        <p class="bottom">券后<span class="final-price">&yen;{{item.finalPrice}}</span><span class="volume">月销{{item.volume}}</span></p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["products"],
  data() {
    return {
      products: []
    }
  },
  methods: {
    clickItem(item) {
      let url = "../product/main?productId=" + item.productId;
      wx.navigateTo({ url });
    }
  }
};
</script>

<style>
.goods-list {
  display: flex;
  flex-flow: row wrap;
  align-content: flex-start;
  padding: 20rpx 15rpx;
}

.goods-list .goods-item {
  -webkit-flex: 0 0 350rpx;
  flex: 0 0 350rpx;
  background-color: #ffffff;
  margin-bottom: 20rpx;
  -webkit-box-shadow: #bdbdbd 0px 0px 5rpx;
  -moz-box-shadow: #bdbdbd 0px 0px 5rpx;
  box-shadow: #bdbdbd 0px 0px 5rpx;
  border-radius: 10rpx;
  box-sizing: border-box;
  overflow: hidden;
}

.goods-list .goods-item:nth-child(2n) {
  margin-left: 10rpx;
}

.goods-list .goods-item:nth-child(2n + 1) {
  margin-right: 10rpx;
}

.goods-list .goods-item .item-pic {
  width: 350rpx;
  height: 350rpx;
}

.goods-list .goods-item .item-title {
  font-size: 30rpx;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
  overflow: hidden;
  margin-bottom: 10rpx;
}

.goods-list .goods-item .item-bottom {
  padding: 10rpx;
}

.goods-list .goods-item .bottom .volume {
  float: right;
  color: #757575;
}

.goods-list .goods-item .bottom {
  color: #cf0000;
  font-size: 28rpx;
}

.goods-list .goods-item .market-price {
  text-decoration: line-through;
  font-size: 26rpx;
  color: #949494;
  margin-bottom: 5rpx;
}
</style>
