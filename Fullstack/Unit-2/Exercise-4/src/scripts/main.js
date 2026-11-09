import { initializeApp } from "https://www.gstatic.com/firebasejs/13.2.0/firebase-app.js";
import { getAuth, signInWithPopup, GoogleAuthProvider } from "https://www.gstatic.com/firebasejs/13.2.0/firebase-auth.js";

const firebaseConfig = {
    apiKey: "AIzaSyCPMsUGp-I5wCDGMbhGbzAfAX99RR6dOrw",
    authDomain: "booklist-b6a49.firebaseapp.com",
    projectId: "booklist-b6a49",
    storageBucket: "booklist-b6a49.firebasestorage.app",
    messagingSenderId: "660934508653",
    appId: "1:660934508653:web:da07d60b0bc1d537093f64"
};

const app = initializeApp(firebaseConfig);
const authentificator = getAuth(app);

signInWithPopup(authentificator, new GoogleAuthProvider())
    .then(result => {
        console.log(result);
    })
    .catch(error => {
        const errorCode = error.code;
        const errorMessage = error.message;
        
        const email = error.customData.email;
        
        const credential = GoogleAuthProvider.credentialFromError(error);
    });