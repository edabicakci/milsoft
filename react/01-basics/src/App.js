
import './App.css';
import FunctionComponent from './FunctionComponent'
import ParentComponent from './ParentComponent';
import FormComponent from './FormComponent';
import StateComponent from './StateComponent';
import ObjectComponent from './ObjectComponent';
import ConditionIf from './further/ConditionIf';
import ConditionTernary from './further/ConditionTernary';
import ConditionAnd from './further/ConditionAnd';
import MapList from './further/MapList';
import MapTable from './further/MapTable';
import MapContainer from './further/example/MapContainer';
import SelectComponent from './further/SelectComponent';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        Merhaba Godoro <br/>
        {/* <FunctionComponent/>  */}
        {/* <ParentComponent/> */}
        {/* <FormComponent/> */}
        {/* <StateComponent/> */}
        {/* <ObjectComponent/> */}
        {/* <ConditionTernary/> */}
        {/* <ConditionAnd/> */}
        {/* <MapList/> */}
        {/* <MapTable/> */}
        {/* <MapContainer/> */}
        <SelectComponent/>

      </header>
    </div>
  );
}

export default App;
