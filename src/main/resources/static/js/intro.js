var app=angular.module("introApp",[]);
app.controller("introCtrl",function($scope,$http){
    var urlBaseIntro="/intro/";

    $scope.getIntro=function(name){
        var urlIntro=urlBaseIntro+name;
        console.log(urlIntro);
        $http({
            method: 'get',
            url: urlIntro
        }).then(function (response) {
            $scope.intro = response.data;
            console.log($scope.data);
        }, function (error) {
            console.log(error, 'can not get data.');
        });
    }
});