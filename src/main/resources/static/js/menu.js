function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("sidenav-link").style.display = "none";
    document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("sidenav-link").style.display = "block";
    document.body.style.backgroundColor = "white";
}
