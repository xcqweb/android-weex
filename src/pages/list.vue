<template>
	<div class="list">
		<!--<div class='colum1'>
			<text class='txt'>{{list.type}}</text>
		</div>
		<div class='colum2'>
			<text class='txt'>{{list.issue?'Issues':'Condition'}}</text>
			<text :class="[list.issue?'light':'icon']">&#xe63c;</text>
		</div>
		<div class="colum3">
			<text class='txt'>{{list.hood}}</text>
		</div>-->
		<div class="colum4">
			<!--<text class='icon'>&#xe600;</text>-->
			<text class='icon btn' @click='report()'>详情&#xe600;</text>
			<!--<text class='icon' @click="recoder(index)">&#xe64f;</text>-->
			<text class='icon btn' @click="recoder()" :class="[pathRec?'view':!recStatus?'':'view2']">{{comTxtRec}}{{pathRec?"&#xe63e;":!recStatus?'&#xe64f;':'&#xe658;'}}</text>
			<!--<text class='icon' @click="picture(index)">&#xe603;</text>-->
			<text class='icon btn' @click="picture()" :class="[pathPic?'view':'']">{{pathPic?'预览图片&#xe603;':'上传图片&#xe642;'}}</text>
			
			<text class='icon btn' @click='video()' :class="[pathVdo?'view':'']">{{pathVdo?'播放视频&#xe605;':'录像&#xe6b6;'}}</text>
			
			<text class='icon btn' @click='light()'>亮度调节</text>
			
			<text class='icon btn' @click='getStroage()'>存储</text>
		</div>
		
	</div>
</template>

<script>
	const storage = weex.requireModule('storage')
    const modal = weex.requireModule('modal')
	import Vue from 'vue'
	import weexVueRouter from 'weex-vue-router'
	import routes from './native-router'//web端的路由在web-router里定义，在app.js里引用
    Vue.use(weexVueRouter,{routes,weex});
	import Nat from 'natjs'
	import { WxcIcon } from 'weex-ui'
	export default{
		data(){
			return{
				pathRec:'',
				pathPic:'',
				pathVdo:'',
				recStatus:false,
			}
		},
		props:{
			list:{
				type:Object
			}
		},
		components:{WxcIcon},
		computed:{
			comTxtRec(){
				if(this.pathRec){
					return "播放录音"
				}else{
					if(!this.recStatus){
						return '录音'
					}else{
						return '停止'
					}
				}
			},
		},
		created(){
			
		},
		methods:{
		   recoder(){
		   	if(!this.pathRec){
		   		if(!this.recStatus){
			   		Nat.recorder.start({
					}, () => {
						this.recStatus = true
					    Nat.toast('start')
					})
			   	}else{
			   		Nat.recorder.stop((err, ret) => {
						if (err) {
							Nat.toast('[ERROR] ' + JSON.stringify(err))
							return
						}
						Nat.toast('stopped, path: ' + ret.path)
						this.pathRec = ret.path
						this.recStatus = false
					})
			   	}
		   	}else{
				Nat.video.play(this.pathRec)
		   	}
		   	
		   	 
		  },
		  picture(){
		  	if(!this.pathPic){
		  		Nat.image.pick({
		  			 limit: 3,
				    showCamera: true,
				}, (err, ret) => {
				    this.pathPic = ret.paths
				})
		  	}else{
		  		Nat.image.preview([
				'http://cdn.instapp.io/nat/samples/bnw.jpeg',
				'http://cdn.instapp.io/nat/samples/fibonacci.jpeg',
				].concat(this.pathPic))
		  	}
		 },
		 video(){
		 	if(!this.pathVdo){
		 		Nat.camera.captureVideo({}, (err, ret) => {
					if (err) {
						Nat.toast('[ERROR] ' + JSON.stringify(err))
						return
					}
					Nat.toast(JSON.stringify(ret, null, 2))
					this.pathVdo = ret.path
				})
		 	}else{
		 		Nat.video.play(this.pathVdo)
		 	}
		 },
		 light(){
		 	Nat.screen.brightness.set(0.26)
		 },
		 report(){
		 	this.$router.push('/report')
		 },
		 screen(){
		 	Nat.screen.info((err, ret) => {
			   Nat.alert(JSON.stringify(ret))
			})
		 },
		 
		 getStroage(){
		 	var mode=weex.requireModule('event');
//		 	mode.getToken(function(data){
//		 		Nat.alert(data.token)
//		 	})
		 	mode.goLogin()
		 }
		

		}
	}
</script>

<style scoped>
	.list{
		width: 750px;
		height: 100px;
		border-bottom-width: 1px;
		border-bottom-style: solid;
		border-bottom-color: #cccccc;
		display: flex;
		flex-direction: row;
		align-items: center;
		justify-content: center;
		padding-left: 20px;
	}
	
	.colum1{
		display: flex;
		flex-direction: row;
		align-items: center;
		flex: 3;
	}
	.colum2{
		display: flex;
		flex-direction: row;
		align-items: center;
		flex: 3;
	}
	.colum3{
		display: flex;
		flex-direction: row;
		align-items: center;
		flex: 2;
	}
	.colum4{
		display: flex;
		flex-direction: row;
		align-items: center;
		flex: 5;
	}
	.txt{
		font-size: 20px;
	}
	
	.icon {
	   font-family: iconfont;
	   margin-left: 10px;
	   font-size: 26px;
	}
	.btn{
		/*width: 100px;*/
		padding-left: 10px;
		padding-right: 10px;
		height: 60px;
		line-height: 60px;
		border-radius: 6px;
		text-align: center;
		background-color: #0088FB;
		color: #fff;
	}
	.light{
		color: lightgreen;
		font-family: iconfont;
	    margin-left: 10px;
	}
	
	.view{
		background-color: #ff6700;
	}
	.view2{
		background-color: #FFC300;
	}
</style>