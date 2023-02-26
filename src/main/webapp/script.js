 function showDiv(divName) {
  var divsToHide = document.getElementsByClassName("divs"); //sets a class to store the divs that are about to be hidden
  for (var i = 0; i < divsToHide.length; i++) {
    divsToHide[i].style.display = "none";
  }
  document.getElementById(divName).style.display = "block"; // the argument is sued to only display the div representing the button topic
}
