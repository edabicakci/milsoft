export default function FormComponent(){

    const handle= () => {
        alert("Kotarıyor...")
    }

    const deal= (input) => {
        alert("uğraşılıyor..." + input)
    }
    const manage= (event) => {
        alert("İşletiliyor..." + event.target.id + ' ' + event.target.tagName)
    }
 
    
    return(
        <div>
            <h1>
                Biçim bileşeni</h1>

                <form>
                    <button onClick = { () => alert("İşleniyor...")}>Çizgi içi   </button>{' '}
                    <button onClick = { handle }> Ok  </button>{' '}
                    <button onClick = { deal('Girdi') }> Değiştirgen  </button>{' '}
                    <button id = "manager"onClick = { (event) => manage() }> Olay  </button>{' '}

                </form>
                
        </div>
    )

} 