 function showDiv(divName) {
  var divsToHide = document.getElementsByClassName("divs");
  for (var i = 0; i < divsToHide.length; i++) {
    divsToHide[i].style.display = "none";
  }
  document.getElementById(divName).style.display = "block";
}
