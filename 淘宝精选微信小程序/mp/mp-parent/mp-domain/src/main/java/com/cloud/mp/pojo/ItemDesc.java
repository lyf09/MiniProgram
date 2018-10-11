package com.cloud.mp.pojo;

import java.util.List;

public class ItemDesc {
    private String api;
    private Data data;
    private List<String> ret;
    private String v;

    public class Data {
        public Data() {
        }


        public Data(List<String> pages, List<String> images) {
            this.pages = pages;
            this.images = images;
        }

        private List<String> pages;
        private List<String> images;

        public List<String> getPages() {
            return pages;
        }

        public void setPages(List<String> pages) {
            this.pages = pages;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "pages=" + pages +
                    ", images=" + images +
                    '}';
        }
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<String> getRet() {
        return ret;
    }

    public void setRet(List<String> ret) {
        this.ret = ret;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "ItemDesc{" +
                "api='" + api + '\'' +
                ", data=" + data +
                ", ret=" + ret +
                ", v='" + v + '\'' +
                '}';
    }
}
