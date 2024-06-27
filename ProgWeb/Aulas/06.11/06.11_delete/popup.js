chrome.tabs.query({active: true, currentWindow: true}, function(tabs) {
    chrome.tabs.sendMessage(tabs[0].id, {action: "getImagesCount"}, function(response) {
      if (chrome.runtime.lastError) {
        document.getElementById('imageCount').innerText = 'Erro ao obter a contagem de imagens.';
      } else {
        document.getElementById('imageCount').innerText = 'Número de imagens: ' + response.count;
      }
    });
  });
  