import { initializeApp } from "https://www.gstatic.com/firebasejs/10.12.5/firebase-app.js";
import { getFirestore, getDoc, addDoc, collection } from "https://www.gstatic.com/firebasejs/10.12.5/firebase-firestore.js";

const firebaseConfig = {
    apiKey: "AIzaSyCdY9jyDneVD9JKPIYZGNLf8gi01CQnYpM",
    authDomain: "testingfirestore-8b040.firebaseapp.com",
    projectId: "testingfirestore-8b040",
    storageBucket: "testingfirestore-8b040.firebasestorage.app",
    messagingSenderId: "625707244820",
    appId: "1:625707244820:web:e07667b288b6ceff9cb601"
};

const app = initializeApp(firebaseConfig);
const db = getFirestore(app);

const data = await getDoc(collection(db, "alumnos"));

