const base = {
    get() {
        return {
            url : "http://localhost:8080/yanchurenyuanyugguanzhong/",
            name: "yanchurenyuanyugguanzhong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yanchurenyuanyugguanzhong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "演出人员与观众疫情信息管理系统"
        } 
    }
}
export default base
