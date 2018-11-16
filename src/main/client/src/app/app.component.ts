import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'IM A ROBOT!';
  result = '';

  constructor(private http : HttpClient ) {}

  private hello(): void {
    this.result = 'loading...';
    this.http.get('/api/hello').subscribe(response => this.result = response["success"]);
  }
}
