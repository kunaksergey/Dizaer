var app=angular.module("introApp",[]);
app.controller("introCrtl",function($scope,$http){
    var urlSaveIntro="/intro/save";

    $scope.save=function(){
        console.log($scope.intro);
        $http.post(urlSaveIntro,$scope.intro)
            .then(
                function (response) {
                    // success callback
                },
                function (response) {
                    // failure callback
                }
            );
    }
});