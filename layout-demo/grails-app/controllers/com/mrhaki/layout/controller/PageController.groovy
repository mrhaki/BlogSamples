package com.mrhaki.layout.controller

import com.mrhaki.layout.domain.Product

class PageController {

    def index = {
        def productList = Product.list()
        render view: '/templates/homepage', model: [productList: productList]
    }
}
