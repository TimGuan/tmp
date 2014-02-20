(function($) {
	$.fn.leftNav = function(options) {
		var opt = $.extend({
			containter:".leftNav",
			btns:"div a",
			subMenu:"ul",
			subCtn:"li",
			hoverCls:"cur",
			defaultIdx:0 		//frmo 0
		},options)
		var _this = $(this);
		var btns = _this.find(opt.btns);
		
		btns.bind('click.leftNav',function(e){
			var _box = _this;
			var _btnClked = $(this);
			if(!_btnClked.hasClass('cur')){
				var lastShow = _this.find('.' + opt.hoverCls);
				if(lastShow){
					lastShow.parents(opt.subCtn).find(opt.subMenu).slideUp();
					lastShow.removeClass(opt.hoverCls);
					_btnClked.addClass(opt.hoverCls);
					_btnClked.parents(opt.subCtn).find(opt.subMenu).slideDown();
				}
			}
		});	
		
		var init = function(dfIdx){
			btns.eq(dfIdx).click();
			return this;
		};
		
		init(opt.defaultIdx);
		
	};
	
})(jQuery);


jQuery(document).ready(function($){
	
	//top navigation
	ddsmoothmenu.init({
		mainmenuid: "ddsmoothmenu", //menu DIV id
		orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
		classname: 'ddsmoothmenu', //class added to menu's outer DIV
		//customtheme: ["#1c5a80", "#18374a"],
		contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
	});	
	
});