function getRelativeX(e, parent) {
	e = e || window.event;
	if (e.target) targ = e.target
	else if (e.srcElement) targ = e.srcElement
	if (targ.nodeType == 3) // defeat Safari bug
		targ = targ.parentNode
   
return e.pageX - $(parent).offset().left || e.clientX + document.body.scroolLeft - $(parent).offset().left;
}

function getRelativeY(e, parent) {
	e = e|| window.event;
	if (e.target) targ = e.target
	else if (e.srcElement) targ = e.srcElement
	if (targ.nodeType == 3) // defeat Safari bug
		targ = targ.parentNode
  
 return e.pageY - $(parent).offset().top || e.clientY + document.boyd.scrollTop - $(parent).offset().top;
}


function getAbsoluteX(e) {
  e = e || window.event;
   
return e.pageX || e.clientX + document.body.scroolLeft;
}

function getAbsoluteY(e) {
  e = e|| window.event;
 return e.pageY || e.clientY + document.boyd.scrollTop;
}