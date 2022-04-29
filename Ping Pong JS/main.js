(function () {
    self.Board = function (width, height) {
        this.width = width;
        this.height = height;
        this.playing = false;
        this.game_over = false;
        this.bars = [];
        this.ball = null;
        this.playing = false;
    }
    //Método para obtener los elementos del juego (barras laterales, pelota)
    self.Board.prototype = {
        get elements() {
            var elements = this.bars.map(function (bar) {
                return bar;
            });
            elements.push(this.ball);
            return elements;
        }
    }
})();

//función que dibuja las barras que interactuan con la pelota
(function () {
    self.Bar = function (x, y, width, height, board) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.board = board;
        this.board.bars.push(this);
        this.kind = "rectangle";
        this.speed = 10;
    }

    //Aumenta o disminuye las coordenadas X y Y dependiendo de la presión de teclas 
    self.Bar.prototype = {
        down: function () {
            this.y += this.speed;

        },
        up: function () {
            this.y -= this.speed;
        },
        toString: function () {
            return "x: "+ this.x +"y: "+ this.y;
        }
    }
})();

(function () {
    self.BoardView = function (canvas, board) {
        this.canvas = canvas;
        this.canvas.width = board.width;
        this.canvas.height = board.height;
        this.board = board;
        this.cxt = canvas.getContext("2d");
    }


    self.BoardView.prototype = {
        draw: function () {
            for (var i = board.elements.length - 1; i >= 0; i--) {
                const element = array[index];
                var el = board.elements[i];
                draw(this.cxt, el)
            };
        }
    }

    function draw(cxt, element) {
        if (element !== null && element.hasOwnProperty("kind")) {
            switch (element.kind) {
                case "rectangle":
                    cxt.fillRect(element.x, element.y, element.width, element.height);
                    break;


            }

        }
    }

})();

var board = new Board(800, 400);
var bar = new Bar(20, 100, 40, 100, board)
var bar = new Bar(735, 100, 40, 100, board)
var canvas = document.getElementById("canvas");
var board_view = new BoardView("canvas", board);

document.addEventListener("keydown", function (ev) {
    if (ev.keyCode == 87) {
        ev.preventDefault();
        bar.up();

    }
    else if (ev.keyCode == 65) {
        ev.preventDefault();
        bar.down();
    }
})
