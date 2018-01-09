$(document).ready(function () {
    $('video').click(function(){
        this[this.paused ? 'play' : 'pause']();
    });
});