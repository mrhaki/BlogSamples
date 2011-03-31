import com.mrhaki.layout.domain.Product

class BootStrap {

    def init = { servletContext ->
        setupProducts()
    }

    def destroy = {
    }

    private void setupProducts() {
        new Product(title: 'Product 1', description: 'Aenean facilisis quam ut sapien rhoncus bibendum. Phasellus viverra leo eu turpis semper nec fermentum nulla pretium. Sed ac nunc cras amet.').save(flush: true)
        new Product(title: 'Product 2', description: 'Vestibulum tristique, nunc sed sodales porta, metus tellus vestibulum lacus, vel egestas leo mauris ut risus. Phasellus ultrices massa nunc.').save()
        new Product(title: 'Product 3', description: 'Mauris blandit diam ut magna feugiat convallis. Donec condimentum eros eros. Suspendisse fermentum lobortis ipsum. Sed faucibus commodo sed').save()
    }
}
