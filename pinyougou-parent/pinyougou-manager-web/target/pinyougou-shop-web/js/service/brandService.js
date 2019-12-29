//服务层
app.service('brandService',function ($http) {
    this.findAll = function () {
        return  $http.post('../brand/findAll.do');
    };

    this.findPage = function (page,size) {
        return $http.get('../brand/findPage.do?page='+page+'&size='+size);
    };

    this.addBrand = function (entity) {
        return $http.post('../brand/add.do',entity);
    };

    this.updateBrand = function (entity) {
        return $http.post('../brand/update.do',entity);
    };

    this.findOne = function (id) {
        return $http.get('../brand/findOne.do?id='+id);
    };

    this.deleteBrand = function (ids) {
        return $http.get("../brand/delete.do?ids="+ids);
    };

    this.search = function (page,size,searchEntity) {
        return $http.post('../brand/search.do?page=' + page +'&size=' + size,searchEntity);
    }
});