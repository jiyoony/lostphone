
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import LostphoneLossmanagementManager from "./components/listers/LostphoneLossmanagementCards"
import LostphoneLossmanagementDetail from "./components/listers/LostphoneLossmanagementDetail"

import PhonemanagementPhonemanagementManager from "./components/listers/PhonemanagementPhonemanagementCards"
import PhonemanagementPhonemanagementDetail from "./components/listers/PhonemanagementPhonemanagementDetail"

import TempphonemanagementRentalPhoneManager from "./components/listers/TempphonemanagementRentalPhoneCards"
import TempphonemanagementRentalPhoneDetail from "./components/listers/TempphonemanagementRentalPhoneDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/lostphones/lossmanagements',
                name: 'LostphoneLossmanagementManager',
                component: LostphoneLossmanagementManager
            },
            {
                path: '/lostphones/lossmanagements/:id',
                name: 'LostphoneLossmanagementDetail',
                component: LostphoneLossmanagementDetail
            },

            {
                path: '/phonemanagements/phonemanagements',
                name: 'PhonemanagementPhonemanagementManager',
                component: PhonemanagementPhonemanagementManager
            },
            {
                path: '/phonemanagements/phonemanagements/:id',
                name: 'PhonemanagementPhonemanagementDetail',
                component: PhonemanagementPhonemanagementDetail
            },

            {
                path: '/tempphonemanagements/rentalPhones',
                name: 'TempphonemanagementRentalPhoneManager',
                component: TempphonemanagementRentalPhoneManager
            },
            {
                path: '/tempphonemanagements/rentalPhones/:id',
                name: 'TempphonemanagementRentalPhoneDetail',
                component: TempphonemanagementRentalPhoneDetail
            },



    ]
})
