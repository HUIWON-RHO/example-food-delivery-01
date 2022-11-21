
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"
import ReviewManager from "./components/listers/ReviewCards"
import ReviewDetail from "./components/listers/ReviewDetail"

import MenuView from "./components/MenuView"
import MenuViewDetail from "./components/MenuViewDetail"
import ReviewView from "./components/ReviewView"
import ReviewViewDetail from "./components/ReviewViewDetail"
import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"


import OrderStatusView from "./components/OrderStatusView"
import OrderStatusViewDetail from "./components/OrderStatusViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },
            {
                path: '/reviews',
                name: 'ReviewManager',
                component: ReviewManager
            },
            {
                path: '/reviews/:id',
                name: 'ReviewDetail',
                component: ReviewDetail
            },

            {
                path: '/menus',
                name: 'MenuView',
                component: MenuView
            },
            {
                path: '/menus/:id',
                name: 'MenuViewDetail',
                component: MenuViewDetail
            },
            {
                path: '/reviews',
                name: 'ReviewView',
                component: ReviewView
            },
            {
                path: '/reviews/:id',
                name: 'ReviewViewDetail',
                component: ReviewViewDetail
            },
            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },


            {
                path: '/orderStatuses',
                name: 'OrderStatusView',
                component: OrderStatusView
            },
            {
                path: '/orderStatuses/:id',
                name: 'OrderStatusViewDetail',
                component: OrderStatusViewDetail
            },


    ]
})
