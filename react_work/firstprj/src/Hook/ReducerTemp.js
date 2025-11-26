import { useState } from 'react';
import Reheader from './ReducerTemp/Reheader';
import Refooter from './ReducerTemp/Refooter';
import Remain from './ReducerTemp/Remain';
import Reside from './ReducerTemp/Reside'


function ReducerTemp(props) {
    //    [state값, 함수] = useReducer(실행할 함수, {state 값})

    const [theme, setTheme] = useState('dark')

    return (
        <div>
            <h1>Reducer 테마</h1>
            <Reheader theme={theme} parSetTh={setTheme} />
            <Refooter theme={theme} />
            <Remain theme={theme} />
            <Reside theme={theme} />


        </div>
    );
}

export default ReducerTemp;