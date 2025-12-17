const container = document.getElementById('container');

function createGrid() {
    // Clear previous grid
    container.innerHTML = '';

    // Get container width and height
    const width = container.clientWidth;
    const height = container.clientHeight;

    // Desired size of each cell (can adjust)
    const cellSize = 100; // px

    // Calculate number of columns and rows
    const columns = Math.floor(width / cellSize);
    const rows = Math.floor(height / cellSize);

    // Update container grid template
    container.style.gridTemplateColumns = `repeat(${columns}, 1fr)`;
    container.style.gridTemplateRows = `repeat(${rows}, 1fr)`;

    // Create grid cells
    for (let i = 0; i < rows * columns; i++) {
        const cell = document.createElement('div');
        cell.style.backgroundColor = `hsl(${Math.random() * 360}, 70%, 80%)`;
        container.appendChild(cell);
    }
}

// Create grid on load
createGrid();

// Recreate grid on window resize
window.addEventListener('resize', createGrid);
