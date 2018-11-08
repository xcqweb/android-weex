<template>
	  <transition name='slide'>
      <div class="row" ref="item" :style="{transform: swipeX,transition:transitionX}"
    @touchstart="ontouchstart" @touchmove="ontouchmove" @touchend="ontouchend">
        <text class="text" :ref="'text'">{{item.id}}</text>
        <text class='del' data-del='del'>删除</text>
      </div>
	  </transition>
</template>

<script>
	const animation = weex.requireModule('animation')
	export default{
		name:'swipe',
		data(){
			return{
				  swipeX:'translateX(0px)',
			    startX:0,
			    startY:0,
			    moveX:0,
			    transitionX:'all 0s ease'
			}
		},
		props:{
			item:{
				type:Object
			},
			index:{
				type:Number
			}
		},
		watch:{
		},
		mounted(){
			this.$nextTick( () => {
			})
		},
		methods:{
			closeSwipe(){
				this.transitionX = 'all 0.6s ease'
				this.swipeX =  'translateX(0px)'
				this.moveX = 0
			},
			ontouchstart:function(e) {
				if(e.target.dataset.del=='del'){
					this.transitionX = 'all 0.6s ease'
					
					this.$refs.item.children[0].innerHTML = ''
					this.$refs.item.children[1].innerHTML = ''
					this.$emit("del",this.index)
					return
				}
				this.$emit('confirm')
				if(this.moveX===-150){
					this.transitionX = 'all 0.6s ease'
					this.swipeX =  'translateX(0px)'
					this.moveX = 0
				}
		       	this.startX = e.changedTouches[0].pageX
		       	this.startY = e.changedTouches[0].pageY
//		         console.log("ontouchStart "+ console.log(e.changedTouches[0].pageX))
	       },
	       ontouchmove:function(e) {
	       	
	       	if(e.changedTouches[0].pageY-this.startY>40 || e.changedTouches[0].pageY-this.startY<-40 ){
//	       		removeEventListener(this.$refs.item,this.ontouchmove)
	       		return
	       	}
	       	
	       	if(e.changedTouches[0].pageX-this.startX>0){
	       		if(this.moveX===0){
	       			return
	       		}else if(this.moveX===-150){
	       			this.transitionX = 'all 0s ease'
	       			if(e.changedTouches[0].pageX-this.startX>0){
	       				return
	       			}else{
	       				this.moveX = e.changedTouches[0].pageX-this.startX
	       			}
	       			
	       		}
	       	}else{
	       		if(e.changedTouches[0].pageX-this.startX<=-150){
	       			this.transitionX = 'all 0.6s ease'
		       	  	this.moveX = -150
	       	  	}else{
	       	  		this.transitionX = 'all 0s ease'
	       	  		this.moveX = e.changedTouches[0].pageX-this.startX
	       	  	}
	       	}
	       	  
	       	  
	          this.swipeX =  `translateX(${this.moveX}px)`
	          
//	          console.log(this.swipeX)
	       },
	       ontouchend:function(e) {
	       	if(this.moveX<-75){
	       		this.transitionX = 'all 0.6s ease'
	       		this.swipeX =  'translateX(-150px)'
	       		this.moveX = -150
	       		e.target.dataset.status = true 
	       	}else{
	       		this.transitionX = 'all 0.6s ease'
	       		this.swipeX =  'translateX(0px)'
	       		this.moveX = 0
	       		e.target.dataset.status = false 
	       	}
	       	this.transitionX = 'all 0.6s ease'
	       	
	       	
	       	this.startX = 0
//	       	console.log(this.moveX)
	       },
//	       ontouchcancel:function(e) {
//	         
//	       }
		}
	}
</script>

<style>
	.row {
    width: 750px;
    height: 136px;
    border-bottom-width: 2px;
    border-bottom-color: #c0c0c0;
    justify-content: center;
    padding:20px;
  }
	.del{
  	position: absolute;
  	top: 0;
  	right: -150px;
  	background-color: #ff0000;
  	text-align: center;
  	color: #ffffff;
  	height: 100%;
  	width: 150px;
  	line-height: 136px;
  }
   .slide-enter, .slide-leave-to
  { 
  	 position: relative;
	}
	.slide-leave-active {
	  height: 0;
	}
</style>