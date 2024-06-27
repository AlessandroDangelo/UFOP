chrome.runtime.onMessage.addListener(function(request, sender, sendResponse) {
    if (request.action == "getImagesCount") {
      var imagesCount = document.querySelectorAll('img').length;
      sendResponse({count: imagesCount});
    }
  });
  
  document.querySelectorAll('img').forEach(function(img) {
    var originalWidth = img.width;
    var originalHeight = img.height;
    img.src = 'img/cat.jpg'; // Substitua pelo caminho da sua imagem preferida
    img.width = originalWidth;
    img.height = originalHeight;
  });
  