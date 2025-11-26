import React from 'react';
import { Link } from 'react-router-dom';

function Pheader(props) {
      return<nav>
        <li>
        <Link to='/'>  홈       </Link>
        <Link to='/cm'>  회사소개  </Link>
        <Link to='/ga'>  갤러리    </Link>
        <Link to='/cms'>  고객센터  </Link>
        </li>
    </nav>
}

export default Pheader;