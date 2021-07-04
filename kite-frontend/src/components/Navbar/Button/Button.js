import React from "react";
import "./Button.css";

const Button = (props) => {
    const {className, text} = props;

    return (
        <div className="buttons">
            <button className={className}>{text}</button>
            {/* <button class="slide">Slide</button>
        <button class="offset">Offset</button> */}
        </div>
    );
};
export default Button;
