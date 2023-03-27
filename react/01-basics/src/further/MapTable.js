export default function MapList(){

    const products = [{id: 301, name: "Cep Tel", price: 234.0},
    {id: 302, name: "pc", price: 878.0},
    {id: 303, name: " Mac", price: 9879.0}];
    
    return(
        <>
        <h3>
            Eşlem Dizelge
            </h3>

            <table>
                <tbody>
            {
                products.map( product => 

                    <tr key= {product.id} > 

                    <td > {product.id}</td>
                    <td> {product.name}</td>
                    <td> {product.price}</td>
                    </tr>


                 

                ) 
                
            }
                
                </tbody>
                </table>
          
            
                
            
        </>
    )

} 