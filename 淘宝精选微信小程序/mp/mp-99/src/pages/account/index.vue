<template>
  <div class="account-panel">
    <div class="account-header">
      <div class="avatar">
        <img src="/static/images/avatar5.png" alt="">
      </div>
      <div class="right-part">
        <div class="nickname">子建6666</div>
        <div class="mobile">152****6148</div>
      </div>
    </div>
    <div class="account-body">
      <div class="body-item">
        <span class="count">29578</span>
        <span class="text">今日金币</span>
      </div>
     <div class="body-item">
        <div class="count">29578 <span class="rmb">2.96元</span></div>
        <div class="text">总金币</div>
     </div>
    </div>
    <div class="account-footer">
      <div class="link-item">
          <div class="icon"><img src="/static/icon/account/shop_change.png" mode="widthFix"></div>
          <div class="text">金币兑换</div>
      </div>
      <div class="link-item w100">
          <div class="icon"><img src="/static/icon/account/account_balance.png" mode="widthFix"></div>
          <div class="text">收益明细</div>
      </div>
      <div class="link-item">
          <div class="icon"><img src="/static/icon/account/mine_invite_apprentice.png" mode="widthFix"></div>
          <div class="text">邀请小伙伴</div>
      </div>
      <div class="link-item">
          <div class="icon"><img src="/static/icon/account/my_favorite.png" mode="widthFix"></div>
          <div class="text">我的收藏</div>
      </div>
      <div class="link-item">
          <div class="icon"><img src="/static/icon/account/mine_question.png" mode="widthFix"></div>
          <div class="text">常见问题</div>
      </div>
      <div class="link-item">
          <div class="icon"><img src="/static/icon/account/kefu.png" mode="widthFix"></div>
          <div class="text">问题反馈</div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  components: {},

  data() {
    return {
      logs: []
    };
  },
  methods: {},

  created() {}
};
</script>

<style>
page {
  background-color: #f3f3f3;
}
.account-header {
  height: 240rpx;
  background-color: #fb655e;
  padding: 0 50rpx;
  display: flex;
}
.account-header .avatar {
  width: 140rpx;
  height: 140rpx;
  border-radius: 10000rpx;
  background-color: rgba(255, 255, 255, 0.7);
  overflow: hidden;
  border: 10rpx solid rgba(255, 255, 255, 0.6);
}
.account-header .right-part {
  color: #ffffff;
  padding: 35rpx;
  padding-top: 20rpx;
  height: 150rpx;
}

.account-header .right-part .nickname {
  margin-bottom: 5rpx;
}

.account-body {
  background-color: #ffffff;
  margin: -30rpx 30rpx 0 30rpx;
  border-radius: 20rpx;
  padding: 20rpx 0;
  display: flex;
  flex-flow: row wrap;
  align-content: flex-start;
  text-align: center;
  box-sizing: border-box;
  margin-bottom: 50rpx;
}
.body-item {
  -webkit-flex: 0 0 50%;
  flex: 0 0 50%;
  border-right: 1rpx solid #f1f1f1;
  box-sizing: border-box;
  font-size: 28rpx;
}

.body-item:last-child {
  border-right: none;
}
.body-item .count {
  display: block;
  color: #fb5a52;
}
.body-item .text {
  color: #242424;
  display: block;
  margin-top: 15rpx;
}

.body-item .rmb {
  background-color: #fb6058;
  color: #ffffff;
  padding: 2rpx 10rpx;
  vertical-align: middle;
  border-radius: 10rpx;
  font-size: 22rpx;
}
.account-footer {
  margin: 0 30rpx;
  margin-top: -30rpx;
  display: flex;
  padding: 20rpx;
  background-color: #ffffff;
  border-radius: 30rpx;
  flex-flow: row wrap;
  align-content: flex-start;
  text-align: center;
  box-sizing: border-box;
}
.link-item {
  text-align: center;
  -webkit-flex: 0 0 33.3%;
  flex: 0 0 33.3%;
  margin-bottom: 25rpx;
  font-size: 22rpx;
}
.link-item .icon {
  width: 67.5rpx;
  height: 55rpx;
  margin: 0 auto;
}

.link-item .icon image{
  width: 55rpx;
  height: 55rpx;
}
</style>
