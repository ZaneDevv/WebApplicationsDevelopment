import { initializeApp } from "https://www.gstatic.com/firebasejs/13.2.0/firebase-app.js";
import { getAuth,
    signInWithEmailAndPassword, signInWithPopup,
    GoogleAuthProvider
} from "https://www.gstatic.com/firebasejs/13.2.0/firebase-auth.js";

// ------------------------------------------------------------------------------------------------------------
// SETTINGS
// ------------------------------------------------------------------------------------------------------------

const firebaseConfig = {
    apiKey: "AIzaSyCPMsUGp-I5wCDGMbhGbzAfAX99RR6dOrw",
    authDomain: "booklist-b6a49.firebaseapp.com",
    projectId: "booklist-b6a49",
    storageBucket: "booklist-b6a49.firebasestorage.app",
    messagingSenderId: "660934508653",
    appId: "1:660934508653:web:da07d60b0bc1d537093f64"
};

// ------------------------------------------------------------------------------------------------------------
// VARIABLES
// ------------------------------------------------------------------------------------------------------------

const app = initializeApp(firebaseConfig);
const authentificator = getAuth(app);

// ------------------------------------------------------------------------------------------------------------
// AUTHENTIFICATION BY USER AND PASSWORD
// ------------------------------------------------------------------------------------------------------------

document.getElementById("user-and-password").addEventListener("click", () => {
    signInWithEmailAndPassword(authentificator, email.value, password.value)
        .then(console.log)
        .catch(error => {
            const errorCode = error.code;
            const errorMessage = error.message;
        })
})

// ------------------------------------------------------------------------------------------------------------
// GOOGLE'S AUTHENTIFICATION
// ------------------------------------------------------------------------------------------------------------

google.addEventListener("click", () => {
    signInWithPopup(authentificator, new GoogleAuthProvider())
        .then(console.log)
        .catch(error => {
            const errorCode = error.code;
            const errorMessage = error.message;
            
            const email = error.customData.email;
            
            const credential = GoogleAuthProvider.credentialFromError(error);
        });
});