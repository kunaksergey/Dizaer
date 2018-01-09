$(document).ready(function () {
    $("#menu").on("click",function (event) {
        event.preventDefault();
        console.log("here");
        var id = $(this).attr('href'),
            top = $(id).offset().top;
        $('body,html').animate({scrollTop: top}, 1000);
    });
});

app=angular.module("",[]);