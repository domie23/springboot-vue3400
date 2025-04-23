import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import kaoqintongzhi from '@/views/modules/kaoqintongzhi/list'
    import kaoqinxiangqing from '@/views/modules/kaoqinxiangqing/list'
    import liuyan from '@/views/modules/liuyan/list'
    import news from '@/views/modules/news/list'
    import yanchuxinxi from '@/views/modules/yanchuxinxi/list'
    import yanchuxinxiOrder from '@/views/modules/yanchuxinxiOrder/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yuangong from '@/views/modules/yuangong/list'
    import yuangongyimiaojiezhong from '@/views/modules/yuangongyimiaojiezhong/list'
    import config from '@/views/modules/config/list'
    import dictionaryKaoqintongzhi from '@/views/modules/dictionaryKaoqintongzhi/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryYanchuxinxi from '@/views/modules/dictionaryYanchuxinxi/list'
    import dictionaryYanchuxinxiOrder from '@/views/modules/dictionaryYanchuxinxiOrder/list'
    import dictionaryYuangongyimiaojiezhong from '@/views/modules/dictionaryYuangongyimiaojiezhong/list'

    import kaoqinxiangqingAdd from '@/views/modules/kaoqinxiangqing/add-or-update'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryKaoqintongzhi',
        name: '考勤类型',
        component: dictionaryKaoqintongzhi
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
	,{
	    path: '/kaoqinxiangqingAdd',
	    name: '考勤',
	    component: kaoqinxiangqingAdd
	}
	
    ,{
        path: '/dictionaryYanchuxinxi',
        name: '表演类型',
        component: dictionaryYanchuxinxi
    }
    ,{
        path: '/dictionaryYanchuxinxiOrder',
        name: '订单状态',
        component: dictionaryYanchuxinxiOrder
    }
    ,{
        path: '/dictionaryYuangongyimiaojiezhong',
        name: '疫苗类型',
        component: dictionaryYuangongyimiaojiezhong
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/kaoqintongzhi',
        name: '考勤通知',
        component: kaoqintongzhi
      }
    ,{
        path: '/kaoqinxiangqing',
        name: '考勤详情',
        component: kaoqinxiangqing
      }
    ,{
        path: '/liuyan',
        name: '留言版',
        component: liuyan
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/yanchuxinxi',
        name: '演出信息',
        component: yanchuxinxi
      }
    ,{
        path: '/yanchuxinxiOrder',
        name: '购票订单',
        component: yanchuxinxiOrder
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/yuangong',
        name: '员工',
        component: yuangong
      }
    ,{
        path: '/yuangongyimiaojiezhong',
        name: '员工疫苗接种情况',
        component: yuangongyimiaojiezhong
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
