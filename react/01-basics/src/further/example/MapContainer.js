import MapItem from './MapItem';

export default function MapContainer({product}){


const products = [{id: 301, name: "Cep Tel", price: 234.0},
{id: 302, name: "pc", price: 878.0},
{id: 303, name: " Mac", price: 9879.0}];
    
    return(
        <>
         <div>

         {products.map( product => 
         <MapItem product= {product}/>
) }


            
         </div>
                
            
        </>
    )

} 

