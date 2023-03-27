
import React from 'react'
export default class SelectComponent extends React.Component{
    
    constructor(props){
        super(props);
        this.productChanged = this.productChanged.bind(this);
        this.save = this.save.bind(this);

        this.products = [{id: 301, name: "Cep Tel", price: 234.0},
        {id: 302, name: "pc", price: 878.0},
        {id: 303, name: " Mac", price: 9879.0}];

        const currentProductId= 302;
        this.state={
            currentProductId: currentProductId,
            currentProduct: this.products.find( p=> p.id === currentProductId)
        }

    }

    productChanged(event){
        const currentProductId = Number(event.target.value);

        if(currentProductId === 0){
            this.setState({
                currentProductId: 0,
                
            })

        }
        
        this.setState({
            currentProductId: currentProductId,
            currentProduct: this.products.find( p=> p.id === currentProductId)
        })

    }

    save(event){
        event.preventDefault();

        
        if(this.state.currentProductId !== 0){
            alert(` Saklanıyor ${this.state.currentProduct.name}`)

        }else{
            alert(` Saklanıyor boş`)
        }
    }

    render(){

        return(
            <>
            <h3>Seçim Sınıf Bileşeni </h3>   
            seçilen öz: 
            {this.state.currentProductId}<br/>
            seçilen nesne: 
            {this.state.currentProduct.id}{' '}
            {this.state.currentProduct.name}{' '}
            {this.state.currentProduct.price}<br/>



            <form onSubmit= {this.save}>
            Ürün seç:
                <select value= {this.state.currentProductId} onChange= {this.productChanged}>
                <option key= {0} value= {0}> 
                            --- Seçiniz ---
                                </option>
                    {
                        this.products.map( product =>
                            <option key= {product.id} value= {product.id}> 
                            {product.name}
                                </option>

                        )
                    }


                </select>
                <input type="submit" value = "Sakla"/>
                
            </form>
            </>
        )


    }
   

} 