var Fly = require("flyio/dist/npm/wx")

const Http = new Fly()


Http.config.baseURL = 'http://localhost:8080/mp-rest/';

// Http.config.baseURL = 'http://120.78.181.190:8080/mp-rest/';

var requestCount = 0;
/**
 *  请求拦截器 添加loading
 */
Http.interceptors.request.use((config, promise) => {
  requestCount++;
  //给所有请求添加自定义header
  config.headers["X-TOKEN"] = "TOKEN";
  config.headers['Content-Type'] = 'application/x-www-form-urlencoded';
  wx.showNavigationBarLoading();
  wx.showLoading({
    title: "加载中",
    mask:true
  });
  // Toast.loading();
  //可以通过promise.reject／resolve直接中止请求
  //promise.resolve("fake data")
  return config;
})

/**
 * 响应拦截器 直接返回 rsponse的data字段
 */
Http.interceptors.response.use((response) => {
  requestCount--;
  if (requestCount <= 0) {
    wx.hideLoading();
    wx.hideNavigationBarLoading()
  }
  //只将请求结果的data字段返回
  return response.data
}, (err, promise) => {
  //发生网络错误后会走到这里
  wx.showToast({
    title: "网络错误",
    icon: "loading",
    mask: true
  });
  promise.resolve("网络错误");
}
)

export default Http