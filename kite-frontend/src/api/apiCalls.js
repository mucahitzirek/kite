import axios from "axios";
import {
    getUserPath,
    getUsersPath,
    loginPath,
    signupPath,
    updateUserPath,
} from "./apiCallsath";

export const signup = (body) => {
    return axios.post(signupPath, body);
};

export const login = (creds) => {
    return axios.post(loginPath, creds);
};
export const changeLanguage = (language) => {
    axios.defaults.headers["accept-language"] = language;
};

export const getUsers = (page = 0, size = 3) => {
    return axios.get(getUsersPath(page, size));
};

export const setAuthorizationHeader = ({isLoggedIn, token}) => {
    if (isLoggedIn) {
        const authorizationHeaderValue = `Bearer ${token}`;
        axios.defaults.headers["Authorization"] = authorizationHeaderValue;
    } else {
        delete axios.defaults.headers["Authorization"];
    }
};

export const getUser = (username) => {
    return axios.get(getUserPath(username));
};

export const updateUser = (username, body) => {
    return axios.put(updateUserPath(username), body);
};
