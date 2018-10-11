<template>
  <div class="product-page">
    <swiper class="swiper" autoplay="false" interval="3000" duration="500" circular="true">
      <div v-for="(item, index) in product.smallImages" :index="index" :key="index">
        <swiper-item>
          <image :src="item" class="slide-image" mode="aspectFill"/>
        </swiper-item>
      </div>
    </swiper>
    <div class="price-wrapper">
      <div class="left">
        <div class="final-price">&yen;{{product.finalPrice}}</div>
        <div class="market-price">
          <p class="original">原价&yen;{{product.marketPrice}}</p>
          <p class="coupon">{{product.couponAmount}}元券</p>
        </div>
      </div>
      <div class="right">
        <p class="text">距结束还剩</p>
        <p class="time"><span class="number">02</span>天<span class="number">07</span>时<span class="number">07</span>分<span class="number">57</span>秒</p>
      </div>
    </div>
    <div class="product-info">
      <p class="product-title">{{product.productTitle}}</p>
      <div class="bottom"><span class="package">包邮</span> <span class="volume">销量{{product.volume}}</span></div>
    </div>
    <div class="shop-info">
      <div class="shop-pic"><img src="//img.alicdn.com/bao/uploaded/i1/122689695/TB1H40WuVooBKNjSZPhXXc2CXXa_!!0-item_pic.jpg" alt=""></div>
      <div class="right">
        <div class="shop-title">{{product.shopTitle}}</div>
        <div class="shop-type taobao tmall">{{product.nickName}}</div>
      </div>
    </div>
    <div class="product-detail">
      <title :text="'商品详情'"></title>
      <img :src="item" class="image"  v-for="(item, index) in product.description" :index="index" :key="index" mode="widthFix"/>
    </div>
    <div class="fixed-panel">
      <div class="favorite"><div class="icon">star</div><div class="text">收藏</div></div>
      <div class="market-price"><div class="icon">&yen;{{product.marketPrice}}</div><div class="text">不领券</div></div>
      <div class="final-price" @click="copy(product)"><div class="icon">&yen;{{product.finalPrice}}</div><div class="text">领券购买</div></div>
    </div>
  </div>
</template>

<script>
import title from "@/components/title";

export default {
  components: {
    title
  },

  data() {
    return {
      product: {}
    };
  },
  methods: {
    copy(product) {
      this.$http
        .post("/product/tpwd", { productId: this.product.productId })
        .then(response => {
          let model = response.result;
          wx.setClipboardData({
            data: model,
            success: function(res) {
              // wx.showModal({
              //   title: "提示",
              //   content: "复制成功",
              //   success: function(res) {
              //     if (res.confirm) {
              //       console.log("确定");
              //     } else if (res.cancel) {
              //       console.log("取消");
              //     }
              //   }
              // });
            }
          });
        });
    },
    getProduct(productId) {
      this.$http.get("product/" + productId).then(response => {
        let product = response.result;
        //产品小图处理
        if (product.smallImages == null && product.smallImages != "null") {
          product.smallImages = [];
          product.smallImages.push(product.coverPic);
        } else {
          product.smallImages = JSON.parse(product.smallImages);
        }
        //产品详情处理
        if (product.description != null && product.description != "null") {
          product.description = JSON.parse(product.description);
        } else {
          product.description = [];
          product.description.push(product.coverPic);
        }
        this.product = product;
        wx.setNavigationBarTitle({
          title: product.productTitle
        });
      });
    }
  },

  onShow() {
    let params = this.$root.$mp.query;
    this.getProduct(params.productId);
  }
};
</script>

<style>
page {
  background-color: #f5f5f5;
}
.swiper {
  height: 750rpx;
}
.price-wrapper {
  margin-top: -125rpx;
  background-color: #ffe167;
  position: relative;
}
.price-wrapper::after {
  content: " ";
  display: table;
  clear: both;
}

.price-wrapper .left {
  background-color: #fb655e;
  width: 410rpx;
  height: 130rpx;
  float: left;
  color: #ffffff;
  display: flex;
  flex-flow: row wrap;
  align-content: flex-start;
  padding: 20rpx 35rpx 10rpx 25rpx;
  box-sizing: border-box;
}
.price-wrapper .left .final-price {
  font-size: 50rpx;
  flex: 0 0 125rpx;
}
.price-wrapper .left .market-price {
  flex: 0 0 155rpx;
  padding-left: 15rpx;
  font-size: 26rpx;
}

.price-wrapper .left .coupon {
  background-color: #e51b45;
  padding: 2rpx 10rpx;
  border-radius: 5rpx;
  margin-top: 15rpx;
  text-align: center;
  display: inline-block;
}

.price-wrapper .right {
  background-color: #ffe167;
  width: 340rpx;
  float: right;
  height: 130rpx;
  position: relative;
  font-size: 28rpx;
  text-align: center;
  padding: 15rpx 30rpx 15rpx 30rpx;
  box-sizing: border-box;
}

.price-wrapper .right .text {
  color: #fb685e;
}

.price-wrapper .right .time {
  color: #69300b;
  font-size: 24rpx;
  margin-top: 15rpx;
}
.price-wrapper .right .time .number {
  padding: 8rpx 5rpx;
  border-radius: 5rpx;
  background-color: #69300b;
  display: inline-block;
  color: #ffffff;
  margin: 0 3rpx;
}

.price-wrapper .right::before {
  content: " ";
  display: block;
  position: absolute;
  height: 0;
  width: 0;
  border-top: 66rpx solid transparent;
  border-right: 35rpx solid #ffe167;
  border-bottom: 66rpx solid transparent;
  left: -34rpx;
  top: 0rpx;
}

.product-info {
  padding: 35rpx 30rpx 25rpx 30rpx;
  background-color: #ffffff;
}
.product-info .product-title {
  font-size: 32rpx;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
  overflow: hidden;
  margin-bottom: 15rpx;
}
.product-info .bottom {
  font-size: 28rpx;
  color: #939393;
}
.product-info .volume {
  float: right;
}

.shop-info {
  background-color: #ffffff;
  margin-top: 10rpx;
  padding: 20rpx 30rpx;
  display: flex;
  flex-flow: row wrap;
  align-content: flex-start;
}
.shop-info .shop-pic {
  width: 100rpx;
  height: 100rpx;
  flex: 0 0 100rpx;
}
.shop-info .shop-title {
  font-size: 28rpx;
  color: #151515;
}
.shop-info .right {
  padding-left: 20rpx;
}

.product-detail {
  margin-top: 10rpx;
  background-color: #ffffff;
  padding-bottom: 105rpx;
}

.product-detail .image {
  height: 750rpx;
  width: 750rpx;
  display: block;
}

.fixed-panel {
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  height: 105rpx;
  background-color: #fb655e;
  display: flex;
  flex-flow: row wrap;
  align-content: flex-start;
  text-align: center;
  color: #ffffff;
}
.fixed-panel .icon {
  margin-top: 15rpx;
  font-size: 30rpx;
  margin-bottom: 5rpx;
}
.fixed-panel .text {
  font-size: 24rpx;
}
.fixed-panel .favorite {
  color: #000000;
  flex: 0 0 165rpx;
  background-color: #ffffff;
}
.fixed-panel .market-price {
  background-color: #ffacaa;
  flex: 0 0 250rpx;
}
.fixed-panel .final-price {
  background-color: #fb655e;
  flex: 0 0 335rpx;
}
</style>
