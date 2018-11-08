<template>
		<list class='mainCon'>
			<cell v-for='(list,index) in lists'>
				<list-item :list='list'></list-item>
			</cell>
		</list>
</template>

<script>
	import listItem from './list.vue'
	export default{
		data(){
			return{
				lists:[
					{type:'engine1',issue:false,hood:'select1'},
					{type:'engine2',issue:true,hood:'select2'},
					{type:'engine3',issue:false,hood:'select3'},
					{type:'engine4',issue:true,hood:'select'},
					{type:'engine5',issue:true,hood:'select'},
					{type:'engine6',issue:false,hood:'select'},
					{type:'engine7',issue:true,hood:'select'},
					{type:'engine8',issue:false,hood:'select'},
					{type:'engine9',issue:true,hood:'select'},
					{type:'engine',issue:false,hood:'select'},
					{type:'engine',issue:true,hood:'select'},
					{type:'engine',issue:true,hood:'select'},
					{type:'engine',issue:false,hood:'select'},
					{type:'engine',issue:true,hood:'select'},
					{type:'engine',issue:false,hood:'select'},
					{type:'engine',issue:true,hood:'select'},
					{type:'engine',issue:false,hood:'select'},
					{type:'engine',issue:false,hood:'select'},
					{type:'engine',issue:false,hood:'select'},
					{type:'engine',issue:true,hood:'select'},
					{type:'engine',issue:false,hood:'select'},
					{type:'engine',issue:true,hood:'select'},
					{type:'engine',issue:false,hood:'select'},
				]
			}
		},
		created(){
			this.initIconFont()
		},
		methods:{
			initIconFont () {
		      let domModule = weex.requireModule('dom')
		      domModule.addRule('fontFace', {
		        'fontFamily': 'iconfont',
		        'src': "url('http://at.alicdn.com/t/font_886417_n4km3uvjfs.ttf')"
		      })
		   },
		},
		components:{listItem}
	}
</script>

<style scoped>
	

</style>