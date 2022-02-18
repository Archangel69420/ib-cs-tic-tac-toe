// Copyright (C) 2020 Jarmo Hurri

// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

public class TicTacToe
{
  public TicTacToe ()
  {
    marks = new Mark [N][N];
  }

  boolean gameOver ()
  {
    int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0, counter6 = 0, counter7 = 0, counter8 = 0;
    boolean flag = false;
    while (!flag) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          if (marks[i][j] == Mark.Cross)
            counter1++;
          if (marks[i][j] == Mark.Nought)
            counter2++;
          if (marks[j][i] == Mark.Cross)
            counter3++;
          if (marks[j][i] == Mark.Nought)
            counter4++;
        }
        if (counter1 ==N || counter2 == N || counter3 == N || counter4 == N)
          flag = true;
        else {
          counter1 = 0; counter2 = 0; counter3 = 0; counter4 = 0;
        }
        if (marks[i][i] == Mark.Cross)
          counter5++;
        if (marks[i][i] == Mark.Nought)
          counter6++;
        if (marks[N - 1- i][i] == Mark.Cross)
          counter7++;
        if (marks[N - 1 - i][i] == Mark.Nought)
          counter8++;
      }
      if (counter5 == N || counter6 == N || counter7 == N || counter8 == N)
        flag = true;
    }
    return flag;
  }
  
  private final int N = 3;
  public Mark[][] marks;

}
