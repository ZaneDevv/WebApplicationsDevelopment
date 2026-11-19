// ------------------------------------------------------
// CONSTANTS
// ------------------------------------------------------

const CLASS_NAME_CELLS = "cell"; 

const PLAYER1 = "X";
const PLAYER2 = "O";

// ------------------------------------------------------
// START
// ------------------------------------------------------

window.onload = () => {
    // ------------------------------------------------------
    // VARIABLES
    // ------------------------------------------------------

    let current_player = "X";
    let matchEnded = false;

    // ------------------------------------------------------
    // METHODS
    // ------------------------------------------------------

    const updateTurnMessage = () => player_turn.innerHTML = `${current_player}'s turn`;
    const swapPlayer = () => current_player = current_player === PLAYER1 ? PLAYER2 : PLAYER1;

    function goToNextRound()
    {
        swapPlayer();
        updateTurnMessage();
    }

    function setWinner(winner)
    {
        matchEnded = true;
        player_turn.innerHTML = `${winner} won!!!`;
    }

    function checkDiagonals()
    {
        let diagonal1 = r00.innerHTML === r11.innerHTML && r11.innerHTML === r22.innerHTML;
        let diagonal2 = r02.innerHTML === r11.innerHTML && r11.innerHTML === r20.innerHTML;

        return diagonal1 || diagonal2 ? r11.innerHTML : undefined;
    }

    function checkVerticals()
    {
        let vertical1 = r00.innerHTML === r10.innerHTML && r10.innerHTML === r20.innerHTML;
        let vertical2 = r01.innerHTML === r11.innerHTML && r11.innerHTML === r21.innerHTML;
        let vertical3 = r02.innerHTML === r12.innerHTML && r12.innerHTML === r22.innerHTML;

        return vertical1 ? r00.innerHTML : vertical2 ? r01.innerHTML : vertical3 ? r02.innerHTML : undefined;
    }

    function checkHorizontals()
    {
        let horizontal1 = r00.innerHTML === r01.innerHTML && r01.innerHTML === r02.innerHTML;
        let horizontal2 = r10.innerHTML === r11.innerHTML && r11.innerHTML === r12.innerHTML;
        let horizontal3 = r20.innerHTML === r21.innerHTML && r21.innerHTML === r22.innerHTML;

        return horizontal1 ? r00.innerHTML : horizontal2 ? r10.innerHTML : horizontal3 ? r20.innerHTML : undefined;
    }

    function getWinner()
    {
        let winnerDiagonals = checkDiagonals()
        if (winnerDiagonals)
            setWinner(winnerDiagonals);

        let winnerVerticals = checkVerticals();
        if (winnerVerticals)
            setWinner(winnerVerticals);

        let winnerHorizontals = checkHorizontals();
        if (winnerHorizontals)
            setWinner(winnerHorizontals);
    }

    // ------------------------------------------------------
    // EVENTS
    // ------------------------------------------------------

    table_board.addEventListener("click", event => {
        if (matchEnded || event.target.className !== CLASS_NAME_CELLS || event.target.innerHTML)
            return;
        
        event.target.innerHTML = current_player;
        goToNextRound();

        getWinner();
    });
    
    // ------------------------------------------------------
    // SET UP
    // ------------------------------------------------------

    updateTurnMessage();
}