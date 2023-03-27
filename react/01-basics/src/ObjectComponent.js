import {useState} from 'react'

export default function ObjectComponent(){

    const initialProduct= {id:301, name: "Cep Telefonu", price:2350.0};
    const [product,setProduct] = useState(initialProduct);  


    const nameChanged= (event) => {
        setProduct({
            id: product.id,
            name: event.target.value,
            price: product.price
        })
    }


    const priceChanged= (event) => {
       

        setProduct({
            ...product,
            price: event.target.value,
        })
    }

    const save= (event) => {
       
event.preventDefault();
alert(` Saklanıyor ${product.id} ${product.name} ${product.price}` );
    }
  
    return(
        <div>
            <h1> Nesne bileşeni</h1>
            {product.id} - {product.name} - {product.price}
            <form onSubmit={save}>

            Özdeş: {product.id} <br/>
            Ad: <input type="text" value= {product.name} onChange={nameChanged}/> <br/>
            Eder: <input type="text" value= {product.price} onChange={priceChanged}/> <br/>
            <input type="submit" value = "Sakla"/>
            </form>
        


                
        </div>
    )

} 