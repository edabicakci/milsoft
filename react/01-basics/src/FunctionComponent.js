export default function FunctionComponent(){
    const myValue = 123;
    const getMyValue = () => {
        return 321;

    }
    const getMyResult = (parameter) => {
        return parameter * parameter;

    }
    return(
        <div>
            <h1>
                İşlev bileşeni</h1>
                Değerim: {myValue} <br/>
                İşlevim: {getMyValue()} <br/>
                Değiştirgenim: {getMyResult(12)}<br/>
            
        </div>
    )

} 