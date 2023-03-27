export default function MapList(){

    const names = ['Html',  'Css','Js', 'Json', 'Ajax'];
    
    return(
        <>
        <h3>
            Eşlem Dizelge
            </h3>

            <ul>
            {
                names.map( name => 
                    <li key= {name}>  {name}</li>

                ) 
            }
                
                </ul>
          
            
                
            
        </>
    )

} 