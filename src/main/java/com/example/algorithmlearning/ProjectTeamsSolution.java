package com.example.algorithmlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Greedy algorithm solution 2
 *
 * 코딩 프로젝트 수업을 가르치는 수찬이는 프로젝트 팀을 가능하면 공정하게 구성하려고 한다.
 * 프로젝트 팀 하나는 두 명의 학생으로 구성되는데, 각 학생들의 코딩 역량은 모두 다르다.
 * 각 학생은 한 팀의 팀원이어야 한다.
 * 공정성을 높이기 위해 수찬이는 팀원 코딩 역량의 합을 최대한 일정하게 유지하려고 한다.
 * 학생들이 코딩 역량이 주어졌을 때 수찬이가 팀을 구성하는데 도움이 되는 프로그램을 작성하라.
 *
 * 문제를 간단하게 하기 위해, 학생 수는 2n이라 가정하자 (n은 양의 정수).
 * 각 학생 si의 코딩 역량은 양의 정수 w(si)로 나타내면
 * 한 i번째 팀 Gi의 코딩 역량은 w(Gi) = ∑s∈Giw(s)로 나타낼 수 있다.
 *
 * 작성할 프로그램 목적은 Sm = min{w(Gi) | 1 ≤ i ≤ n}이 최대화되도록
 * n개의 팀 G1, G2, …, Gn 을 구성하고 이때 Sm을 출력하는 것이다.
 *
 * 예를 들어, 학생들의 코딩 역량이 {1, 7, 5, 8}로 주어졌다면
 * (8, 1), (7, 5)로 2개의 조를 짤 수 있으며 프로그램은 9를 출력해야 한다.
 *
 * @see <a href="https://www.acmicpc.net/problem/20044">BAEKJOON = Project Teams</a>
 */
public class ProjectTeamsSolution {

  public static void main(final String[] args) throws IOException {
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int numberOfTeam = Integer.parseInt(br.readLine());
    final int[] abilities = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .sorted()
        .toArray();

    final int minAbilitySum = IntStream.range(0, numberOfTeam)
        .map(i -> abilities[i] + abilities[abilities.length - 1 - i])
        .min()
        .orElse(-1);

    System.out.println(minAbilitySum);
  }

}
