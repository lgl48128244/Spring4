var videoNum = 0;
var audioNum = 0;
var imgNum=0;
var graphNum = 0;
var scriptNum = 0;
var otherNum = 0;

function addVideo(){
  var str = "<table frame='box'><tr><th colspan='2'>新增视频文件"+(videoNum+1)+"</th></tr><tr><td>md5:</td><td><input name ='videoFiles["+videoNum+"].md5'/></td></tr>" 
	+"<tr><td>名称（videoName）:</td><td><input name='videoFiles["+videoNum+"].videoName'/></td></tr><tr><td>地址（videoURL）:</td><td><input  name='videoFiles["+videoNum+
		"].videoURL'/></td></tr></table>";
  $("#video").append(str);
  videoNum++;
}

function addAudio(){
	  var str = "<table frame='box'><tr><th colspan='2'>新增音频文件"+(audioNum+1)+"</th></tr><tr><td>md5:</td><td><input name ='audioFiles["+audioNum+"].md5'/></td></tr>" 
		+"<tr><td>名称（audioName）:</td><td><input name='audioFiles["+audioNum+"].audioName'/></td></tr><tr><td>地址（audioURL）:</td><td><input  name='audioFiles["+audioNum+
			"].audioURL'/></td></tr></table>";
	  $("#audio").append(str);
	  audioNum++;
	}

function addImg(){
	  var str = "<table frame='box'><tr><th colspan='2'>新增图片文件"+(imgNum+1)+"</th></tr><tr><td>md5:</td><td><input name ='imageFiles["+imgNum+"].md5'/></td></tr>" 
		+"<tr><td>名称（imageName）:</td><td><input name='imageFiles["+imgNum+"].imageName'/></td></tr><tr><td>地址（imageURL）:</td><td><input  name='imageFiles["+imgNum+
			"].imageURL'/></td></tr></table>";
	  $("#img").append(str);
	  imgNum++;
	}

function addGraph(){
	  var str = "<table frame='box'><tr><th colspan='2'>新增图形文件"+(graphNum+1)+"</th></tr><tr><td>md5:</td><td><input name ='graphFiles["+graphNum+"].md5'/></td></tr>" 
		+"<tr><td>名称（graphName）:</td><td><input name='graphFiles["+graphNum+"].graphName'/></td></tr><tr><td>地址（graphURL）:</td><td><input  name='graphFiles["+graphNum+
			"].graphURL'/></td></tr></table>";
	  $("#graph").append(str);
	  graphNum++;
	}
function addScript(){
	  var str = "<table frame='box'><tr><th colspan='2'>新增文稿文件"+(scriptNum+1)+"</th></tr><tr><td>md5:</td><td><input name ='scriptFiles["+scriptNum+"].md5'/></td></tr>" 
		+"<tr><td>名称（scriptName）:</td><td><input name='scriptFiles["+scriptNum+"].scriptName'/></td></tr><tr><td>标题（scriptTitle）:</td><td><input  name='scriptFiles["+scriptNum+
			"].scriptTitle'/></td></tr></table>";
	  $("#script").append(str);
	  scriptNum++;
	}
function addOtherFile(){
	  var str = "<table frame='box'><tr><th colspan='2'>新增其他文件"+(otherNum+1)+"</th></tr><tr><td>md5:</td><td><input name ='otherFiles["+otherNum+"].md5'/></td></tr>" 
		+"<tr><td>名称（fileName）:</td><td><input name='otherFiles["+otherNum+"].videoName'/></td></tr><tr><td>地址（fileURL）:</td><td><input  name='otherFiles["+otherNum+
			"].videoURL'/></td></tr></table>";
	  $("#other").append(str);
	  otherNum++;
	}