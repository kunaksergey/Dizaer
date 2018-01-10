$(document).ready(function () {
    $("#menu").on("click", function (event) {
        event.preventDefault();
        console.log("here");
        var id = $(this).attr('href'),
            top = $(id).offset().top;
        $('body,html').animate({scrollTop: top}, 1000);
    });

});

var app = angular.module("welcome", []);
app.controller("welcomeCtrl", function ($scope, $http) {
    $scope.showMore = function () {
        var urlShowMore = "/intro/showMore";
        $("#show-more-link").hide();
        $http({
            method: 'get',
            url: urlShowMore
        }).then(function (response) {
            $scope.intros = response.data;
        }, function (error) {
            console.log(error, 'can not get data.');
        });
    }
});
