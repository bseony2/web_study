import { response } from 'express';
import React, { useEffect } from 'react'
import { FaCode } from "react-icons/fa";
import {API_KEY, API_URL} from 'client\src\components\Config.js';
function LandingPage() {

    useEffect(() =>{
        const endpoint = `${API_URL}/movie/popular?api_key=${API_KEY}&language=en-US&page=1`;

        fetch(endpoint)
        .then(response => response.json())
        .then(response => console.log(response))
    }, [])


    return (
        <div style={{width: '100%', margin: '0'}}>

            {/*Main Imagety*/ }

            <div style={{width: '85%', margin: '1rem auto'}}>

                <h2>Movie sby latest</h2>
                <hr />
                
                {/*Movies by latest*/}

            </div>

        <div style={{display: 'flex', justifyContent: 'center'}}>
            <button> Load More</button>
        </div>

        </div>
    )
}

export default LandingPage
