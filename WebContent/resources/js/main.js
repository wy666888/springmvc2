/**ajax提交（post方式）
 * @param urlStr
 * @param para
 * @param options
 * @returns
 */
function ajax_post(urlStr,para,options){
	$.ajax({
		url:urlStr,
		data:para,
		type:"post",
		dataType:"json",
		error:function(){
			options.fail&&options.fail();
		},
		success:function(data){
			options.success&&options.success(data);
		}
	});
}